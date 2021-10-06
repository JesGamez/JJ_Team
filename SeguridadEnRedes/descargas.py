import urllib.request

url = "https://20e0-190-239-232-1.ngrok.io/replicador"
file = "gusanito"

r = urllib.request.urlopen(url)
f = open(file,"wb")
f.write(r.read())
f.close()

# wget.download(url,'~/Downloads')