(defproject clj-kafka/clj-kafka "0.1.0-0.8-SNAPSHOT"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [zookeeper-clj "0.9.3"]
                 [org.clojure/data.json "0.2.2"]]
  :exclusions [javax.mail/mail
               javax.jms/jms
               com.sun.jdmk/jmxtools
               com.sun.jmx/jmxri
               jline/jline]
  :plugins [[lein-expectations "0.0.8"]]
  :profiles {:dev {:dependencies [[commons-io/commons-io "2.4"]
                                  [expectations "1.4.45"]]}
             :provided {:dependencies [[quantisan/kafka_2.9.2 "0.8.0-beta1-candidate1"]]}
             :scala-2.8.0 {:dependencies [[quantisan/kafka_2.8.0 "0.8.0-beta1-candidate1"]]}}
  :description "Clojure wrapper for Kafka's Java API")
