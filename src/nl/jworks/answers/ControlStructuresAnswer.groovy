int numberValue = 10
boolean booleanValue = true
def object = new Object()

assert numberValue && booleanValue && object

numberValue = 0
booleanValue = false
object = null

assert !numberValue && !booleanValue && !object
