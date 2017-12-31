(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [quil "2.6.0"]
                 [org.clojure/clojurescript "1.9.473"]]

  :plugins [[lein-cljsbuild "1.1.5"]
            [lein-figwheel "0.5.14"]]
  :hooks [leiningen.cljsbuild]

  :cljsbuild
  {:builds [{:source-paths ["src"]
             :id "development"
             :figwheel {:on-jsload "{{sanitized}}.core/run-sketch"}
             :compiler
             {:main "{{sanitized}}.core"
              :output-to "resources/public/js/main.js"
              :output-dir "resources/public/js/out"
              :asset-path "js/out"}}]})
