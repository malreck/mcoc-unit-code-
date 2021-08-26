import java.util.*;
class units {
    public static void main(String[] args) {
        Random obj = new Random();
        int N=0,UC=0,TB=0,eq=0,t=0;
        int x = 1000000; //Enter number of battlechips here
        int z = 100000;//Enter how many simulations you want to run to get average values at the end 
        int C1=0,C2=0,C3=0;
        int k1=(x/2000);int k2=(x/10000); int k3=(x/50000);int c1=0,c2=0,c3=0;
        for(int j=1; j<=z; j++){            
        for(int i=1;i<=k1;i++) {
            int m=obj.nextInt(2000)+1;
            if(m<=194) {
                c1+=15;
            }
            else if(m>194 && m<= 300)
            c1+=45;
        }
        C1= C1+c1; 
        for(int i=1;i<=k2;i++) {
            int m=obj.nextInt(2000)+1;
            if(m<=194) {
                c2+=75;
            }
            else if(m>194 && m<= 300)
            c2+=225;
        }
        C2= C2+c2; 
        for(int i=1;i<=k3;i++) {
            int m=obj.nextInt(2000)+1;
            if(m<=194) {
                c3+=375;
            }
            else if(m>194 && m<= 300)
            c3+=1125;
        }
        C3= C3+c3; 
        t=(c1>c3)?((c1>c2)?(c1):(c2)):((c3>c2)?(c3):(c2));
        if(t==c1)N++;
        else if(t==c2)UC++;
        else if(t==c3)TB++;
        else eq++;
        c1=0;c2=0;c3=0;
    }
        System.out.println("avg Normal crystal units:"+(int)(C1/z));
        System.out.println("avg UC crystal units:"+(int)(C2/z));
        System.out.println("avg TB crystal units:"+(int)(C3/z));
        System.out.println("Cases where Normal is highest:"+N);
        System.out.println("Cases where UC is highest:"+UC);
        System.out.println("Cases where TB is highest:"+TB);
        System.out.println("Other cases:"+eq);
        System.out.println("Total:"+(N+UC+TB+eq));
    }
}
