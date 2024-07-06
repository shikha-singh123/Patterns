import java.util.Scanner;

public class star1_pattern {
    static void star1Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void star2Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
   static void star3Pattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
            System.out.println();
    }
   }
   static void star4Pattern(int n){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
            System.out.println();
      }
   }
   static void star5Pattern(int n){
     for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
          System.out.print("* ");
        }
          System.out.println();
     }
   }

   static void star6Pattern(int n){
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
            System.out.println();
    }
   }
 static void star7Pattern(int n){
    for(int i=0;i<n;i++){
        for(int j=n-1;j>i;j--){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i+1;j++){
            System.out.print("*");
        }
        for(int j=n-1;j>i;j--){
            System.out.print(" ");
        }
        System.out.println();
    }
 }
    static void star8Pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*(n-i+1)-2;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
           System.out.println();
        }
    }
   
   static void star9Pattern(int n){
      for(int i=0;i<n;i++){
        for(int j=n-1;j>i;j--){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i+1;j++){
            System.out.print("*");
        }
        for(int j=n-1;j>i;j--){
            System.out.print(" ");
        }
        System.out.println();
    }
 
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*(n-i+1)-2;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
           System.out.println();
        }
   }
  static void star10Pattern(int n){
    for(int i=0;i<=2*n-2;i++){
            int stars;
            if(i>=n){
                stars=2*n-i-2;
            }else{
                stars=i;
            }
        for(int j=0;j<=stars;j++){
            System.out.print("*");
        }
            System.out.println();

    }
  }
    static void star11Pattern(int n){
        for(int i=0;i<n;i++){

            int start;
            if(i%2==0){
                start=1;
            }else{
                start=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
                System.out.println();
        }
    }
     static void star12Pattern(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                   System.out.print(j + " ");
            }
            for(int j=1;j<=2*(n-i);j++){
                   System.out.print(" ");
         }
                     for(int j=i;j>=1;j--){
                   System.out.print(j + " ");
            }
                   System.out.println();
            }
     }
     static void star13Pattern(int n){
        int start=1;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
              System.out.print(start+" ");
              start=1+start;
        }
        System.out.println();
       }
     }
      
      static void star14Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
              int ascii=65+j;
               char ch=(char)ascii;
               System.out.print(ch+" ");
            }
               System.out.println();
        }
      }

    static void star15Pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                int ascii=65+j;
                char ch=(char)ascii;
                System.out.print(ch+" ");
            }
                System.out.println();
        }
    }
    static void star16Pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int ascii=65+i;
                char ch=(char)ascii;
                System.out.print(ch+" ");
            }
                System.out.println();
        }
    }
    static void star18Pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int ascii=65+(n-j-1);
                char ch=(char)ascii;
                System.out.print(ch+" ");
            }
                System.out.println();
        }
    }
 static void star17Pattern(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        char ch='A';
        int breakpoint=i;
        for(int j=0;j<=2*i;j++){
            System.out.print(ch+" ");
            if(j<breakpoint)ch++;
            else ch--;
        }
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
            System.out.println();
    }
 }
   static void star19Pattern(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        for(int j=0;j<2*i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n-1;i>=0;i--){
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
         for(int j=0;j<2*i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   }

  static void star20Pattern(int n){
    for(int i=0;i<2*n-1;i++){
        int stars;
        if(i<n){
            stars=i;
        }else{
            stars=(2*n-i-2);
        }
        for(int j=0;j<=stars;j++){
            System.out.print("*");
        }
        for(int j=0;j<2*(n-stars-1);j++){
            System.out.print(" ");
        }
         for(int j=0;j<=stars;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
  }
   static void star21Pattern(int n){
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0||j==0||i==n-1||j==n-1){
                System.out.print("*");
            }else{
                System.out.print(" ");

            }
        }
                System.out.println();
     }
   }
    static void star22Pattern(int n){
    for(int i=0;i<2*n-1;i++){
        for(int j=0;j<2*n-1;j++){
            int top=i;
            int left=j;
            int right=(2*n-2)-j;
            int bottom=(2*n-2)-i;
            System.out.print(n-Math.min(Math.min(left,right),Math.min(top,bottom))+" ");
        }
        System.out.println();
    }
   }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = scn.nextInt();

        // star1Pattern(n);
        // star2Pattern(n);
        // star3Pattern(n);
        // star4Pattern(n);
        // star5Pattern(n);
        // star6Pattern(n);
        // star7Pattern(n);
        //  star8Pattern(n);
        //  star9Pattern(n);
        //  star10Pattern(n);
        //  star11Pattern(n);
        // star12Pattern(n);
            // star13Pattern(n);
            // star14Pattern(n);
            // star15Pattern(n);
            // star16Pattern(n);
            // star17Pattern(n);
            // star18Pattern(n);
            // star19Pattern(n);
            // star20Pattern(n);
            // star21Pattern(n);
            star22Pattern(n);

    }
}
