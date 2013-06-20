class Database {
    void connect() {
        throw new RuntimeException("Could not connect to the database")
    }

    void close() {
        println "Closing connection to the database"
    }

}

Database database = new Database()

try{
    database.connect()
} catch(e) {
    System.err.println("Error ${e}")
} finally {
    database.close()
}


