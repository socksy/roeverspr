(ns roeverspr.core
  (:require [clojure.string :as s]))

(defn encode
  [input]
  (let [consonants #{\b \c \d \f \g "h" \j \k \l \m \n \p \q \r \s \t \v \w \x \y \z}]
  (apply str (map 
               (fn [x] (if (contains? consonants (s/lower-case x))
                         (str x "o" x)
                         x))
               input))))

(defn -main
  []
  (println (encode "Hello, World!")))

;(apply my-fn (list "a" "b" 3))
;(my-fn "a" "b" 3)

;(if true
;   x
;   y)