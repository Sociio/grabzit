#!/usr/bin/python

class GrabzItScrapeException(Exception):

	SUCCESS = 0
	PARAMETER_MISSING_SCRAPE_ID = 158
	PARAMETER_INVALID_SCRAPE_ID = 159
	PARAMETER_MISSING_SCRAPE_STATUS = 160
	PARAMETER_INVALID_SCRAPE_STATUS = 161
	PARAMETER_INVALID_SCRAPE_STATUS_CHANGE = 162	
	NETWORK_SERVER_OFFLINE = 200
	NETWORK_GENERAL_ERROR = 201
	NETWORK_DDOS_ATTACK = 202
	RENDERING_ERROR = 300
	RENDERING_MISSING_SCREENSHOT = 301
	GENERIC_ERROR = 400
	UPGRADE_REQUIRED = 500
	FILE_SAVE_ERROR = 600
	FILE_NON_EXISTANT_PATH = 601

	def __init__(self, message, code):
		Exception.__init__(self, message)
		self.Code = code