object Q3 extends App{

    def toUpper(str: String): String = str.toUpperCase

    def toLower(str: String): String = str.toLowerCase

    def formatNames(name: String, formatter: String => String): String = {
      formatter(name)
    }


    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    val formattedNames = names.map { name =>
        formatNames(name, toUpper)
      }

  println(formattedNames.mkString(" "))




}
