package Ch09 {
  package Ex07 {

    import scala.io.Source

    object Main extends App {
      val src = Source.fromFile("C:\\testFiles\\Ch09ex07.txt", "UTF-8")
      // вещественные числа
      // -?[0-9]+([.]?[0-9]+)?
      //  -       - начинается со знака "-"
      //    ?       - которого может и не быть
      //  [0-9]   - продолжается цифрами 0 - 9
      //    +       - которые могут встречаться от одного раза и более
      // (        - далее следуют группа...
      //      [.]     - далее следует точка
      //        ?       - которой может и не быть
      //      [0-9]   - и цифры 0-9
      //        +     - которые могут встречаться от одного раза и более
      //  )?      - ... заканчивается группа, которой может и не быть
      src.mkString.split("\\s+").toArray.filter(!_.matches("-?[0-9]+([.]?[0-9]+)?")).map(println(_))
      src.close
    }
  }
}



