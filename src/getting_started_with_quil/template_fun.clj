(ns getting-started-with-quil.template_fun
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  {})  
 
(defn update-state [state]
  state)        
                                
(defn draw [state])
  
  
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


