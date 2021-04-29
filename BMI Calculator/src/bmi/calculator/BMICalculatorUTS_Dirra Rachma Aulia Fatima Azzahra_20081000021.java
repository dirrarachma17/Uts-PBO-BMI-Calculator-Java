package bmi.calculator;
public class BMICalculator {
    public static void main(String[] args) {
        int beratbadan = 51;
        float tinggibadan = 1.55f;
        float bmi=(beratbadan/(tinggibadan*tinggibadan));
        
        System.out.println("HALLO!HALLO!! JADI BMI ANDA\t:"+bmi);
        
        if (bmi<18.5){
            System.out.println("ANDA TERGOLONG KURUS, TETAP SEMANGATT YA!!");
        }
        else if (bmi<24.9){
            System.out.println("ANDA TERGOLONG NORMAL, TETAP SEMANGATT YA!!");
        }
        else if (bmi<29.9){
            System.out.println("ANDA TERGOLONG GEMUK, TETAP SEMANGATT YA!!");
        }
        else if (bmi>30.0){
            System.out.println("ANDA TERGOLONG OBESITAS, TETAP SEMANGAT YA!!");
        }