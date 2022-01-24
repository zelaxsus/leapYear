import java.util.Scanner;
public class leapYear {




        public static void main(String[] args) {
            int year, leapYear;

            Scanner inp = new Scanner(System.in);
            System.out.print("Yıl Giriniz : ");
            year = inp.nextInt();
            if (year <=100)
            {
                int shortYear;
                shortYear= year%4;
                if(shortYear==0){
                    System.out.println(year + " bir artık yıldır !");

                }
                else
                {
                    System.out.println(year +"bir artık yıldır değildir !");
                }

            }
            else {
                if (year >=100) {
                    leapYear = year % 4;
                    if (leapYear == 0) {
                        System.out.println(year + " bir artık yıldır !");
                    } else {
                        System.out.println(year + " bir artık yıldır değildir !");
                    }
                }

            }
        }
    }


