import java.util.*;

 public class Collectionframework {

    Solider Solider[];
    Quater Quater[];
    Vector<Soledier_Quater> ed;
 
    String _Solider[][] = { 
             {"1", "SunSinLee", "4", "3", "2023-01-20", "010-1232-2342" },
             {"2", "JaeInLee", "4", "3", "2023-01-20", "010-1223-2322" },
             {"3", "GiHongLee", "4", "3", "2023-01-20", "010-3432-1232" },
             {"4", "ChiKim", "4", "4", "2023-01-20", "010-1342-2124" },
             {"5", "OkSunKwon", "4", "4", "2023-01-20", "010-9987-2162" },
             {"6", "JunSikMun", "3", "4", "2023-01-20", "010-2332-2332" },
             {"7", "MinHuGong", "3", "4", "2023-01-20", "010-5675-2363" },
             {"8", "DaHyeKim", "3", "4", "2023-01-20", "010-1253-1245" },
             {"9", "SuYunKim", "3", "4", "2023-01-20", "010-9822-2634" },
             {"10", "JaeMyeongLee", "3", "1", "2023-01-20", "010-2345-2653" },
             {"11", "SaRangKim", "3", "1", "2023-01-20", "010-1235-1453" },
             {"12", "JungHwanAn", "3", "1", "2023-01-20", "010-1743-6234" },
             {"13", "Yone", "3", "1", "2023-01-20", "010-7653-7453" },
             {"14", "Yasuo", "2", "1", "2023-01-20", "010-7363-7434" },
             {"15", "JiMinGim", "2", "2", "2023-01-20", "010-7534-7312" },
             {"16", "Ahri", "2", "2", "2023-01-20", "010-4543-3433" },
             {"17", "Lux", "2", "2", "2023-01-20", "010-1345-5232" },
             {"18", "Hex", "2", "2", "2023-01-20", "010-5223-4564" },
             {"19", "Column", "1", "3", "2023-01-20", "010-2342-2353" },
             {"20", "Handler", "1", "3", "2023-01-20", "010-2134-3243" },
             };
    String _Quater[][] = { 
             {"1", "2", "1" },
             {"2", "2", "1" },
             {"3", "1", "2" },
             {"4", "1", "2" }
             };
     
     public Collectionframework() {
         Solider = new Solider[20]; 
         Quater = new Quater[4]; 
         ed = new Vector<Soledier_Quater>(); 
         
         for (int i = 0; i < _Solider.length; i++) {
             Solider[i] = new Solider(Integer.parseInt(_Solider[i][0]), _Solider[i][1], Integer.parseInt(_Solider[i][2]), Integer.parseInt(_Solider[i][3]) , _Solider[i][4] , _Solider[i][5]);
         }
 
         for (int i = 0; i < _Quater.length; i++) {
                 Quater[i] = new Quater(Integer.parseInt(_Quater[i][0]), Integer.parseInt(_Quater[i][1]), Integer.parseInt(_Quater[i][2]));			
         }
         //getAll : 매개변수로 보낸 객체의 정보를 출력하는 메서드
         getAll(Solider);
         getAll(Quater);
        //getOne_number : 주어진 번호를 가진 객체의 정보를 출력하는 메서드         
         getOne_number(3);
         //getHoghangiRank(int select_rank) : 정해진 계급의 혹한기 참여수를 구하는 메서드
         System.out.println("혹한기를 2번 하는 상병은 " + getHoghangiRank(3) + "명입니다.");
     }	
    
     
     public static void main(String[] args) {

         new Collectionframework();
     }

     private void getAll(Object[] objs) {
		for (int i = 0; i < objs.length; i++) {
			System.out.println( objs[i].toString() );
		}
	}
    
    private void getOne_number(int number){
        for(int i = 0; i < Solider.length; i++){
            if(Solider[i].number == number){
                System.out.println(Solider[i].toString());
            }
        }
    }
    //혹한기하는 계급을 구하는 클래스
    private int getHoghangiRank(int select_rank) {
        int temp = 0;
		for(int i=0; i < Solider.length; i++) {
	        if(Solider[i].rank == select_rank){
                for(int j = 0 ; j < Quater.length; j++){
                    if(Solider[i].quater == Quater[j].quater){
                        temp += Quater[j].hoghangi;
                    }
                }
            }
	    }
        return temp;
	} 
 }