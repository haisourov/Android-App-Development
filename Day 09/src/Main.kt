class Pc(var cpu: String, var ram: Int, var gpu: String){
    fun CpuName(){
        println(cpu)
    }
    fun GpuName(){
        println(gpu)
    }
    fun RamCapacity(){
        println("$ram GB")
    }

}

fun main(args: Array<String>) {
    val hp = Pc("i3 3220", 8, "gtx 650ti")
print(
"""${hp.ram} GB 
${hp.cpu}
${hp.gpu}
""")
    hp.CpuName()
    hp.GpuName()
    hp.RamCapacity()

}