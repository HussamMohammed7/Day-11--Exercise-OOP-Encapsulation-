//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        try {
//            Account hussam = new Account("1", "Hussam", 10000);
//            Account ali = new Account("2", "Ali", 5000);
//            Account mohammed = new Account("3", "mohammed");
//
//            System.out.println(ali.credit(5000));
//
//            System.out.println(hussam.transferTo(ali, 9500));
//            System.out.println(hussam.debit(501));
//            System.out.println(hussam.toString());
//            System.out.println(ali.toString());
//            System.out.println(mohammed.toString());
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
//
//

try {
        Employee hussam = new Employee ("1", "Hussam", 10000);
        hussam.setId("2");
        Employee hussam2 = new Employee ("2", "Hussam", 10000);

        System.out.println(hussam.getSalary());
        System.out.println(hussam.getAnnualSalary());
        System.out.println(hussam.raisedSalary(50));
        System.out.println(hussam.getSalary());
        System.out.println(hussam.getAnnualSalary());
    System.out.println(hussam.toString());
    System.out.println(hussam2.toString());
    }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
      }



    }






}