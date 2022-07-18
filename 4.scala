object Main extends App {
def wholesaleCost(x:Double)=24.95*0.6*x + 3*x + (x-50)*0.75;
var wholesaleCost: Double= wholesaleCost(60);
println( "Total wholesale cost for 60 copies :" + wholesaleCost);
  
}