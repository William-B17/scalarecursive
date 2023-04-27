
object MyClass {
    def mainmap(newlist: List[Int],oldlist: List[Int],f:Int): Any = {

        oldlist match {
            case List() => return newlist
            case _ => {
                var l = newlist
                l = l :+ oldlist.head+f
                mainmap(l,oldlist.tail,f)
            }
        }
    }
    
    def main(args: Array[String]) {
        println(mainmap(List(),List(1,2,3),2))
    }
}
