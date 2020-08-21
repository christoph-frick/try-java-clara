(ns net.ofnir.clara
  (:require [clara.rules :refer :all])
  (:import [net.ofnir.clara Customer Promotion]))

(defrule awesome-customer-is-vip
  [Customer (= "Tim" name)]
  =>
  (insert! (Promotion. "Tims get promotion")))

(defquery get-promotions
  "Query the promotions."
  []
  [?promotion <- Promotion])
