package grazioso_rescue;

import java.lang.String;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class RescueAnimal {

    // Instance variables
    private String name;
    private Gender gender;
    private int age = 0;
    private double weight = 0.0d;
    private LocalDate acquisitionDate;
    private String acquisitionCountry;
	private TrainingStatus trainingStatus = TrainingStatus.WILD;
    private boolean reserved = false;
	private String inServiceCountry;

	public RescueAnimal() {
	}

	public RescueAnimal(String name, Gender gender, int age, double weight, LocalDate acquisitionDate, String acquisitionCountry, TrainingStatus trainingStatus, boolean reserved, String inServiceCountry) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.acquisitionDate = acquisitionDate;
		this.acquisitionCountry = acquisitionCountry;
		this.trainingStatus = trainingStatus;
		this.reserved = reserved;
		this.inServiceCountry = inServiceCountry;
	}

	private final static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public abstract String getType();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = Gender.fromString(gender);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public LocalDate getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(String acquisitionDate) throws InputMismatchException {
		if (acquisitionDate == null || acquisitionDate.isEmpty()) {
			this.acquisitionDate = LocalDate.now();
		} else {
			try {
				this.acquisitionDate = LocalDate.parse(acquisitionDate, DATE_TIME_FORMATTER);
			} catch (Exception ex) {
				var msg = "Date format is wrong for: " + acquisitionDate;
				System.out.println(msg);
				throw new InputMismatchException(msg);
			}
		}
	}

	public String getAcquisitionCountry() {
		return acquisitionCountry;
	}

	public void setAcquisitionCountry(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}

	public TrainingStatus getTrainingStatus() {
		return trainingStatus;
	}

	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = TrainingStatus.fromString(trainingStatus);
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	public String getInServiceCountry() {
		return inServiceCountry;
	}

	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}
}
