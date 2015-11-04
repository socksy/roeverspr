(ns roeverspr.coretest
  (:use clojure.test)
  (:require
    [roeverspr.core :as r]))

(deftest roeverspr
  (testing "Roeverspr encoding for 'Jag talar Rövarspråket!'"
           (is (= "Jojagog totalolaror Rorövovarorsospoproråkoketot!"
                  (r/encode "Jag talar Rövarspråket!")))))