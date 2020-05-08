package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionManager {
	
	private List<Question> unaskedQues;
	private List<Question> askedQues;
	private Integer numOfQuestion;
	
	QuestionManager(){
		unaskedQues = new ArrayList<>();
		askedQues = new ArrayList<>();
		numOfQuestion = 0;
		
		Question q = new Question("Name a clinical trial in which blood is transfused from recovered COVID-19 patients to a coronavirus patient who is in critical condition?",List.of("Plasma Therapy","Solidarity","Remdesivir","Hydroxychloroquine"),1);
		unaskedQues.add(q);
		numOfQuestion++;
		q = new Question("How does Coronavirus transmit?",List.of("When a person sneezes or cough, droplets spread in the air or fall on the ground and nearby surfaces."
				,"If another person is nearby and inhales the droplets or touches these surfaces and further touches his face, eyes or mouth, he or she can get an infection."
				,"If the distance is less than 1 meter from the infected person."
				,"All the above are correct."),4);
		unaskedQues.add(q);
		numOfQuestion++;
		q = new Question("In which age group the COVID-19 spreads?",
				List.of("COVID-19 occur in all age groups"
				,"Coronavirus infection is mild in children"
				,"Older person and persons with pre-existing medical conditions are at high risk to develop serious illness."
				,"All the above are correct"),4);
		unaskedQues.add(q);
		numOfQuestion++;
		q = new Question("What is Coronavirus?",
				List.of("It is a large family of viruses"
				,"It belongs to the family of Nidovirus"
				,"Both A and B are correct"
				,"Only A is correct."),3);
		unaskedQues.add(q);
		numOfQuestion++;
		q = new Question("The first case of novel coronavirus was identified in .....",
				List.of("Beijing"
				,"Shanghai"
				,"Wuhan, Hubei "
				,"Tianjin"),3);
		unaskedQues.add(q);
		numOfQuestion++;
		q = new Question("Which of the following diseases are related to coronavirus?",
				List.of("MERS"
				,"SARS"
				,"Both A and B"
				,"Neither A nor B"),3);
		unaskedQues.add(q);
		numOfQuestion++;
		q = new Question("From where coronavirus got its name?",
				List.of("Due to their crown-like projections."
				,"Due to their leaf-like projections."
				,"Due to their surface structure of bricks."
				,"None of the above"),1);
		unaskedQues.add(q);
		numOfQuestion++;
		q = new Question("What are the precautions that need to be taken to protect from the coronavirus?",
				List.of("Cover your nose and mouth when sneezing."
				,"Add more garlic into your diet."
				,"Visit your doctor for antibiotics treatment"
				,"Wash your hands after every hour."),1);
		unaskedQues.add(q);
		numOfQuestion++;
	}
	
	Question getRandomQues() {
		Random rand = new Random(); 
        Question ques =  unaskedQues.get(rand.nextInt(unaskedQues.size()));
        unaskedQues.remove(ques);
        askedQues.add(ques);
        
        return ques;
	}
	
	Integer getNumOfQues() {
		return numOfQuestion;
	}

}
