public class Quater {

    int quater, military_guerrilla, hoghangi;
    int endMonth[] = new int[3];

    public Quater(int quater, int military_guerrilla, int hoghangi) {
		super();
		this.quater = quater;
		this.military_guerrilla = military_guerrilla;
		this.hoghangi = hoghangi;
        switch(quater){
            case 1 : endMonth[0] = 7;
                    endMonth[1] = 8;
                    endMonth[2] = 9;
                    break;
            case 2 : endMonth[0] = 10;
                    endMonth[1] = 11;
                    endMonth[2] = 12;
                    break;
            case 3 : endMonth[0] = 1;
                    endMonth[1] = 2;
                    endMonth[2] = 3;
                    break;
            case 4 : endMonth[0] = 4;
                    endMonth[1] = 5;
                    endMonth[2] = 6;
                    break;
        }
	}

    public String toString() {
        return "Quater [분기=" + quater + ", 유격횟수=" + military_guerrilla + ", 혹한기횟수="
            + hoghangi + ", 전역하는달=" + endMonth[0] + "~" + endMonth[2] + "]";
      }
  
      public int getQuater() {
        return quater;
      }
    
      public void setQuater(int quater) {
        this.quater = quater;
      }
    
      public int getMilitary_guerrilla() {
        return military_guerrilla;
      }
    
      public void setMilitary_guerrilla(int military_guerrilla) {
        this.military_guerrilla = military_guerrilla;
      }

      public int getHoghangi() {
        return hoghangi;
      }
    
      public void setHoghangi(int hoghangi) {
        this.hoghangi = hoghangi;
      }

}
