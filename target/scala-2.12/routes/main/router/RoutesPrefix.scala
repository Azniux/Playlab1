
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/WEBDESIGN/hello/play-java-seed/conf/routes
// @DATE:Thu Oct 19 11:42:38 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
