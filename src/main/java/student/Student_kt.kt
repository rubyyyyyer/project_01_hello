package student

fun main() {
    val stu = Student_kt("Rubyyyyyer",60,100)
    stu.print()
}

class Student_kt(var name:String, var math:Int,var english:Int) {
    fun print(){
        println(name + "\t" + math + "\t"+ english + "\t" + (math+english)/2)
    }
}