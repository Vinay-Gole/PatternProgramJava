class Solution{
  public static void  main(String args[]){
    int  n=6;
    // patternone(n);
    // patterntwo(n);
    // patternthree(n);
    // patternfour(n);
    patternfive(n);

  }

  static void patterntwo(int n){
    for(int i=n;i>=1;i--){
      for(int j=1;j<i;j++){
        if(j==i){
          System.out.print("*");
        }
        System.out.print("*"+" 1");
      }
      System.out.println();
    }
  }

  static void patternone(int n){
for(int i=1;i<n;i++){
  for(int j=i;j<n;j++){
    System.out.print("*"+" ");
  }
  System.out.println();
}
  }

  static void patternthree(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("  *  ");
        } else {
          System.out.print(" |0| ");
        }
      }
      System.out.println();
      System.out.println();
    }
  }

  static void patternfour(int n){
    for(int i=0;i<n;i++){
      for(int j=1;j<i;j++){
        System.out.print(" "+j);
      }
      for(int k=0;k<n;k++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  

  static void  patternfive(int n){

    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print("   ");
      }
      for(int k=1;k<i;k++){
        System.out.print(" "+"*"+" ");
      }
      System.out.println();
    }

  }

//   Output:

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
}