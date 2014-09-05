(ns {{name}}.core
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (q/frame-rate 30)
  (q/color-mode :hsb)
  {:color 0
   :angle 0})

(defn update [{:keys [color angle]}]
  {:color (mod (+ color 0.7) 255)
   :angle (mod (+ angle 0.1) q/TWO-PI)}))

(defn draw [{:keys [color angle]}]
  (q/background 240)
  (q/fill color 255 255)
  (let [x (* 150 (q/cos angle))
        y (* 150 (q/sin angle))]
    (q/with-translation [(/ (q/width) 2)
                         (/ (q/height) 2)]
      (q/ellipse x y 100 100))))

(q/defsketch {{name}}
  :title "You spin my circle right round"
  :size [500 500]
  :setup setup
  :update update
  :draw draw
  :middleware [m/fun-mode])
