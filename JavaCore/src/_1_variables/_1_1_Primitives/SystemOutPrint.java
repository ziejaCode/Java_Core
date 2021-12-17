package _1_variables._1_1_Primitives;



// created by Marcin 
public class SystemOutPrint {
        public static void main(String args[]){

            int a = 5, b = 6, c = 7, d = 4;
            
            System.out.println(a++ + "\t" +  b + c);       // 5  67
            c +=3;
            System.out.println((a + ++b) + "\t" + c + d);  // 13 104
            a--; ++d;
            System.out.println((d % ++c));                 // 0
            d -= 3;
            System.out.println(a + b + (c + d));           //    22
            


        }

}

