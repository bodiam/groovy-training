package nl.jworks.answers
// Strings
String number = 'one'
assert number == 'one'

// GStrings
String name = 'Atos'
String text = "welcome $name"
assert text == "welcome Atos"

// Multiline GStrings
String language = 'Groovy'
String trainer = 'Erik'
String template = """welcome to
our training
about $language
presented by $trainer"""

def result = '''welcome to
our training
about Groovy
presented by Erik'''

assert result == template