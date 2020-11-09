(defproject hello-world "0.1.0-SNAPSHOT"
  :description "A basic hello world project, for learning clojure and lein"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "2.0.0"]
                 [cheshire "5.10.0"]]
  :main hello-world.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :aot [hello-world.core])
