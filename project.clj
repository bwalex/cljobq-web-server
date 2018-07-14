(defproject cljobq-web-server "0.1.4"
  :description "Standalone cljobq-web service"
  :url "https://github.com/bwalex/cljobq-web-server"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[cljobq-web "0.1.4"]
                 [com.carouselapps/to-jdbc-uri "0.5.0"]
                 [http-kit "2.2.0"]
                 [io.aviso/logging "0.3.1"]
                 [org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.cli "0.3.7"]
                 [org.postgresql/postgresql "42.1.4"]]

  :main ^:skip-aot cljobq-web-server.core
  :target-path "target/%s"
  :plugins [[lein-eftest "0.5.1"]
            [jonase/eastwood "0.2.6-beta2"]
            [lein-codox "0.10.4"]
            [lein-kibit "0.1.6"]]
  :profiles {:uberjar {:aot :all}})
