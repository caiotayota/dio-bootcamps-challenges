package br.com.dio.challenge.domain;

public class Course extends Content {
    
    private int creditHour;
    
    @Override
    public double calculateXp() {
        return STANDARD_XP * creditHour;
    }
    
    public Course() {
    }
    
    
    public int getCreditHour() {
        return creditHour;
    }
    
    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }
    
    @Override
    public String toString() {
        return "Course {" +
                "Title ='" + getTitle() + '\'' +
                ", Description ='" + getDescription() + '\'' +
                ", Credit Hour =" + creditHour +
                '}';
    }
}