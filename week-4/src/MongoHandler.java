import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;

import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

class MongoHandler {
	
	private MongoClient mongoClient;
	private MongoDatabase database;
	
	MongoHandler(String dbName){
		connect();
		createDB(dbName);
	}
	
	private void connect() {
		if(mongoClient == null)
		mongoClient = MongoClients.create();
	}
	
	private void createDB(String dbName) {
		if(database == null)
		database = mongoClient.getDatabase(dbName);
	}
	
	public String getWord(String word) {
		MongoCollection<Document> collection = database.getCollection("words");
		Document doc = collection.find(eq("english",word)).first();
		if(doc == null) {
			return null;
		}
		return doc.toJson();
	}
	
	public void insert(String English, String German, String French) {
		Document document = new Document("english",English)
				.append("translations",new Document("german",German)
						.append("french",French));
		
		MongoCollection<Document> collection = database.getCollection("words");
		
		collection.insertOne(document);
		
	}
	
	
	
	

}
