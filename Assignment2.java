package session2;

class Assignment2{


public static void main(String args[]){
int s= 0 ;

for ( int i = 1 ; i <= 3 ; i++){                   //code for printing first three line
for (int j = 1 ; j <= 3 - i  ; j++){
System.out.print(" ");
}
for (int k =97 ;k <= i+96 ; k++){

System.out.print((char)k);                     //using type casting
}
if (i == 2){
System.out.print("a");
}
if (i == 3){
System.out.print("ba");
}
System.out.println("");
}

 for (int p = 1 ; p<=2 ;p++){         //code for priting last two lines 
for (int q = 1 ; q <= p ;q++){
System.out.print(" ");
}
for (int r = 97 ; r <= 97+ p - s ;r++){
if ( p == 1){
s = 0; 
}
if (p == 2){
s = 2;
}
System.out.print((char)r);
}
if (p == 1){
System.out.print("a");
}
System.out.println();
}

}
}
