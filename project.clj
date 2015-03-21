(defproject cljs-unit-test "0.1.0-SNAPSHOT"
  :description "Unit tests demo application"
  :url "http://abratukhin.blogspot.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src/clj" "src/cljs"]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3123"]
                 [com.cemerick/clojurescript.test "0.3.3"]]

  :plugins [[lein-cljsbuild "1.0.5"]
            [com.cemerick/clojurescript.test "0.3.3"]]

  :hooks [leiningen.cljsbuild]

  :cljsbuild {
    :test-commands {"unit" ["phantomjs" :runner
                            "resources/private/js/unit-test.js"]}
     :builds {
              :dev
              {:source-paths ["src/cljs"]
               :compiler {
                          :output-to "resources/private/js/main.js"
                          :optimizations :whitespace
                          :pretty-print true
                          }}
              :test
              {:source-paths ["src/cljs" "test/cljs"]
               :compiler {
                          :output-to "resources/private/js/unit-test.js"
                          :optimizations :whitespace
                          :pretty-print true
                          }}
              }}
  )
