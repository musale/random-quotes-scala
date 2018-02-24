// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user0/Projects/random-quote/conf/routes
// @DATE:Mon Mar 12 12:13:13 EAT 2018


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
