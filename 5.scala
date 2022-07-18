object Demo extends App{
    def easy(x:Int):Int=x*8;
    def tempo(x:Int):Int=x*7;

    var totalTime: Int = easy(2)+tempo(3)+easy(2);
    println( "Total running time :" + totalTime);
}
