class Rectangle(var length: Double, var breath:Double ) extends Polygon {

  override def area:Double = length * breath
  def perimeter:Double =  4*length
}
