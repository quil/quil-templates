(ns leiningen.new.quil
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "quil"))

(defn quil
  "Clojure template for Quil library."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' quil project.")
    (->files data
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["project.clj" (render "project.clj" data)]
             ["LICENSE" (render "LICENSE" data)]
             [".gitignore" (render "gitignore" data)]
             ["README.md" (render "README.md" data)])))
