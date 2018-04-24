import datetime
import getpass
import re

from cm_api.api_client import ApiResource

# Connection Settings.
host = 'http://quickstart.cloudera'
port = 7180
user = 'cloudera'
password = 'cloudera'

api = ApiResource(host, 7180, user, password, version=16)

# Finds the first first cluster.
cluster = api.get_all_clusters()[0]

