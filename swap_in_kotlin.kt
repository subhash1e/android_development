fun main(){
   var a = 5;
   var b = 6;
   a = b.also{b=a};
   //  OR  a = b.also({b=a});
   println("a = $a, b = $b");
}
