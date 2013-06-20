class Message {
    String text
}

class Result {
    String value

    Message message
}

// Elvis
// TODO: Fix the error
Result result = new Result(value: 'ok', message: new Message(text:'it was ok'))
println result.value == 'ok' ? result.message : 'error'
println result.value == 'ok' ?: 'error'

result = new Result(value: 'error', message: new Message(text: 'something went wrong'))
println result.message.text

// Switch can be of any type
// TODO: Add the error branch
def testSwitch(val) {
    def result
    switch (val) {
        case ~/^Switch.*Groovy$/:
            result = 'Pattern match'
            break
        case BigInteger:
            result = 'Class isInstance'
            break
        case 60..90:
            result = 'Range contains'
            break
        case [21, 'test', 9.12]:
            result = 'List contains'
            break
        case 42.056:
            result = 'Object equals'
            break
        case { it instanceof Integer && it < 50 }: // We see closures later.
            result = 'Closure boolean'
            break
        case [groovy: 'Rocks!', version: '1.7.6']:
            result = "Map contains key '$val'"
            break
        default:
            result = 'Default'
            break
    }
    result
}

assert testSwitch("Switch to Groovy") == 'Pattern match'
assert testSwitch(42G) == 'Class isInstance'
assert testSwitch(70) == 'Range contains'
assert testSwitch('test') == 'List contains'
assert testSwitch(42.056) == 'Object equals'
assert testSwitch(20) == 'Closure boolean'
assert testSwitch('groovy') == "Map contains key 'groovy'"
assert testSwitch('default') == 'Default'

// For loop

// Classic for loop.
def results = []

for (i = 0; i < 5; i++) {
    results << i
}
assert results == [0,1,2,3,4]

results = []
def list = [0, 1, 2, 3, 4]

// Classic Java for-each loop.
for (int i : list) {
    results.add(i)
}
assert results == [0,1,2,3,4]

// Groovy for-each loop.
results = []
for (i in list) {
    results << i
}
assert results == [0,1,2,3,4]
