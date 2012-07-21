(ns website.views
  (:use [hiccup core page]))

(defn home-page [] 
  (html
    [:head 
      [:title "Hello"]]
    [:body
      [:h1 "Hello"]]))
