(ns hello-world.core
  (:gen-class)
  (:require [clj-http.client :as client])
  (:require [cheshire.core :refer :all]))

(defn getPokemon [id]
  (parse-string
    (:body (client/get (str "https://pokeapi.co/api/v2/pokemon/" id)))
    true)); true: give keys as symbols, eg :name = "bulbasaur"

(defn -main 
  "I take a pokedex numebr and fetch that pokemon's name from the api"
  [number]
  (let [pokename (:name (getPokemon number))]
    (println "Pokemon number #" number "is" pokename)))

