* arquivos que mostra a estrutura resultante depois de rodar o comando "quicompare --mono-light --traffic-mode ffmpeg --dut-host 192.168.0.117 --dut-user root --dut-iface ens18 --port 443 --url https://netlab/video.mkv --duration 30 --clients 10 --unit mbps --sample-rate 1
* pasta_root = pasta que o comando quicompare foi executado

# pasta_root/apache2/cubic/quicompare-mpeg-light-mono-20260210_153705/fractal/arquivo.json

Contém as seguintes informações:
* "hurst_rs": 0.8666381319781008
* "alpha_tail_shape": 5.1989463129890545
* "hill_estimator": 0.19234666792030505
* "fd_madogram": 2.585543214067741,
* whittle_estimator": NaN,
* classification mice

# pasta_root/apache2/cubic/quicompare-mpeg-light-mono-20260210_153705/logs/
# pasta_root/apache2/cubic/quicompare-mpeg-light-mono-20260210_153705/meta/summary_20260210_153705.txt

Contém as seguintes informações:
* version: QUICompare LIGHT MONO v4.1.5
* traffic_mode: ffmpeg
* target_url: https://netlab/video.mkv
* dut_host: 192.168.0.124
* dut_iface: ensl8
* port: 443
* duration_seconds: 30
* clients: 16
* unit: mbps
* sanple_rate: I
* avg_throughput: 25. 434426810810812
* hurst_rs: 0.8666381319781008
* alpha_tail_shape: 5.1989463129890545
* hill_estimator: 0.19234666792030505
* fd_madogran: 2.585543214067741
* whittle_estimator: nan
* flow_classification: mice
* throughput_series_csv: quicompare-mpeg-light-mono-20260210_153705/series/throughput_20260210_153705.csv
* latency_series_csv: quicompare-mpeg-light-mono-20260210_153705/series/latency_20260210_153705.csv
* fractal_metrics_json: quicompare-mpeg-light-mono-20260210_153705/fractal/fractal_metrics_20260210_153705.json
20260210 153705.json
run_dir: quicompare-mpeg-light-mono-20266210_153705

# pasta_root/apache2/cubic/quicompare-mpeg-light-mono-20260210_153705/pcap/arquivo.pcap

O arquivo.pcap vai ser usado para extrair a latência usando o tshark, já que o arquivo "latency_20260210_153705.csv" vem vazio

# pasta_root/apache2/cubic/quicompare-mpeg-light-mono-20260210_153705/series

Contém os seguintes arquivos:
* latency_20260210_153705.csv // obs: arquivo vazio
* throughput_20260210_153705.csv