import java.util.*;

 public class Collectionframework {

    Solider Solder[];
    Quater Quater[];
    Vector<Soledier_Quater> ed;
 
    String _Solider[][] = { 
             {"1", "SunSinLee", "4", "3", "2023-01-20", "010-1232-2342" },
             {"2", "JaeInLee", "4", "3", "2023-01-20", "010-1232-2342" },
             {"3", "GiHongLee", "4", "3", "2023-01-20", "010-1232-2342" },
             {"4", "ChiKim", "4", "4", "2023-01-20", "010-1232-2342" },
             {"5", "OkSunKwon", "4", "4", "2023-01-20", "010-1232-2342" },
             {"6", "JunSikMun", "3", "4", "2023-01-20", "010-1232-2342" },
             {"7", "MinHuGong", "3", "4", "2023-01-20", "010-1232-2342" },
             {"8", "DaHyeKim", "3", "4", "2023-01-20", "010-1232-2342" },
             {"9", "SuYunKim", "3", "4", "2023-01-20", "010-1232-2342" },
             {"10", "JaeMyeongLee", "3", "1", "2023-01-20", "010-1232-2342" },
             {"11", "SaRangKim", "3", "1", "2023-01-20", "010-1232-2342" },
             {"12", "JungHwanAn", "3", "1", "2023-01-20", "010-1232-2342" },
             {"13", "Yone", "3", "1", "2023-01-20", "010-1232-2342" },
             {"14", "Yasuo", "2", "1", "2023-01-20", "010-1232-2342" },
             {"15", "JiMinGim", "2", "2", "2023-01-20", "010-1232-2342" },
             {"16", "Ahri", "2", "2", "2023-01-20", "010-1232-2342" },
             {"17", "Lux", "2", "2", "2023-01-20", "010-1232-2342" },
             {"18", "Hex", "2", "2", "2023-01-20", "010-1232-2342" },
             {"19", "Column", "1", "3", "2023-01-20", "010-1232-2342" },
             {"20", "Handler", "1", "3", "2023-01-20", "010-1232-2342" },
             };
    String _Quater[][] = { 
             {"1", "2", "1" },
             {"2", "2", "1" },
             {"3", "1", "2" },
             {"4", "1", "2" }
             };
     
     public Collectionframework() {
         emps = new Emp[8]; 
         depts = new Dept[3]; 
         ed = new Vector<EmpDept>(); 
         
         for (int i = 0; i < _emps.length; i++) {
             emps[i] = new Emp(Integer.parseInt(_emps[i][0]), _emps[i][1], Integer.parseInt(_emps[i][2]));
         }
 
         for (int i = 0; i < _depts.length; i++) {
                 depts[i] = new Dept(Integer.parseInt(_depts[i][0]), _depts[i][1]);			
         }
         
         
     }	
    
     public static void main(String[] args) {
         // TODO Auto-generated method stub
         new EmpDeptMnt();
 
     }
 
 }