# Importing necessary modules
from selenium import webdriver
from selenium.webdriver.chrome.options import Options

try:
    # Initializing webdriver with headless option
    options = Options()
    options.add_argument('--headless')
    options.add_argument('--disable-gpu')
    driver = webdriver.Chrome('./chromedriver', options=options)

    # Opening website and printing the title
    driver.get("https://www.python.org")
    print(driver.title)

except Exception as e:
    # Handling exceptions 
    print(e)

finally:
    # Closing the webdriver
    driver.quit()
