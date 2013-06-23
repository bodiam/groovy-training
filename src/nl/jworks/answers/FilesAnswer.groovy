// Write the following text to a file

def text = """1 hello, this file will
2 be written to a file
3 I can retrieve it later
4 and do things with it
"""

new File('/tmp/later.txt').text = text

// Read the file
List<String> lines = new File('/tmp/later.txt').readLines()

// Find only the lines starting with an even number, and print them
lines.each { line ->
    if( ((int) line.substring(0, 1)) % 2 == 0) {
        println line
    }
}