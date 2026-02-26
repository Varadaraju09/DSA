class Payment {
    double regFees, admFees, balAmt;

    public Payment(double regFees , double admFees, double balAmt) {
        this.regFees = regFees;
        this.admFees = admFees;
        this.balAmt = balAmt;
    } 
}

class Information {
    char blockNo;
    int floorNo, roomNo, bedNo;

    public Information(char blockNo, int floorNo,int roomNo, int bedNo) {
        this.blockNo = blockNo;
        this.floorNo = floorNo;
        this.roomNo = roomNo;
        this.bedNo = bedNo;
    }
}

public class Patient {
    String patientName , disease,dateOfArrival;
    int patientAge;
    Information info;
    Payment pay;

    public Patient(String patientName, int patientAge, String disease, String dateOfArrival,
        Information info, Payment pay) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.disease = disease;
        this.dateOfArrival = dateOfArrival;
        this.info = info;
        this.pay = pay;
    }
    void patientDetails() {
        System.out.println("Name: "+this.patientAge);
        System.out.println("Age: "+this.patientAge);
        System.out.println("Disease: "+this.disease);
        System.out.println("Date of Arrival: "+this.dateOfArrival);
        System.out.println("Block Number: "+this.info.blockNo);
        System.out.println("Floor Number: "+this.info.floorNo);
        System.out.println("Room Number: "+this.info.roomNo);
        System.out.println("Bed Number: "+this.info.bedNo);
        System.out.println("Admission Fees: "+this.pay.admFees);
        System.out.println("Registration Fees: "+this.pay.regFees);
        System.out.println("Balance Amount: "+this.pay.balAmt);  
    }
    public static void main(String[] args) {
        Information info = new Information('C',4,5,7);
        Payment pay = new Payment(50000, 5000, 3000);
        Patient patient = new Patient("Abc",30,"Covid","25/02/2026",info,pay);
        patient.patientDetails();
    }
}
