import uuid
result = uuid.uuid4()
print("UUID4:")
print(result)

results = uuid.uuid5(uuid.NAMESPACE_DNS,"example.com")
print("UUID5:")
print(results)