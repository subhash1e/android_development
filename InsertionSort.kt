@ComparisionSort
@StableSort


fun main(){
  var arr = arrayOf(3,4,2,1,555,1,0,-8);
  for( i in 1 until arr.size){
    for(j in i downTo 1){
      if(arr[j-1] < arr[j])break
      else arr[j-1] = arr[j].also({arr[j]=arr[j-1]})
      // we are simply transversing to each index and putting it to its right pos 
      // in already left sorted array
      // start from [3] sorted [4,2,1] unsorted
      // then put 4 in right place by comparing [3,4] [2,1]
      // then [2,3,4] [1]
      // then [1,2,3,4]
      
     }
  }

   for(x in arr)print(x.toString() + " ");
  
}
