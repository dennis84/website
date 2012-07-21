(ns website.handler
  (:use compojure.core
        website.views)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [compojure.response :as response]))

(defroutes app-routes
  (GET "/" [] (home-page))
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
