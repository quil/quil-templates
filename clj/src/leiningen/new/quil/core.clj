(ns {{name}}.core
  (:require [quil.core :as q]))

(defn draw []
  (q/background 255)
  (q/fill 0)
  (q/ellipse 56 46 55 55))

(q/defsketch {{name}}
  :draw draw
  :size [300 300])
