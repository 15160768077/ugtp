package ugtp.utils;

import org.springframework.core.io.ClassPathResource;
import ugtp.utils.common.FastDFSFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 实现FastDFS文件管理
 *
 * @author 杜清胜
 * @date 2021/11/16 6:12
 */
public class FastDFSUtil {

//    /**
//     * 加载Tracker连接信息
//     */
//    static {
//        try {
//            String filename = new ClassPathResource("E:\\A-UsedRabbit-Project\\est\\est-service\\src\\main\\resources\\fdfs_client.conf").getPath();
//            ClientGlobal.init(filename);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (MyException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 文件上传
//     * @param fastDFSFile
//     * @return uploads
//     */
//    public static String[] upload(FastDFSFile fastDFSFile) throws IOException, MyException {
//        NameValuePair[] meta_list  =new  NameValuePair[1];
//        meta_list[0] = new NameValuePair("author",fastDFSFile.getAuthor());
//        TracckerServer trackerServer = getTrackerServer();
//        StorageClient storageClient = getStorageClient(trackerServer);
//        String[] uploads = storageClient.upload_file(fastDFSFile.getContent(), fastDFSFile.getExt(), meta_list);
//        return uploads;
//    }
//
//    /**
//     * 读取文件信息
//     * @param groupName
//     * @param remoteName
//     * @return FileInfo
//     */
//    public static FileInfo getFile(String groupName, String remoteName) throws IOException, MyException {
//        TrackerServer trackerServer = getTrackerServer();
//        StorageClient storageClient = getStorageClient(trackerServer);
//        return storageClient.get_file_info(groupName,remoteName);
//    }
//
//
//    /**
//     * 文件下载
//     * @param groupName
//     * @param remoteName
//     * @return
//     * @throws IOException
//     * @throws MyException
//     */
//    public static InputStream downFile(String groupName, String remoteName) throws IOException, MyException {
//        TrackerServer trackerServer = getTrackerServer();
//        StorageClient storageClient = getStorageClient(trackerServer);
//        byte[] buffer =storageClient.download_file(groupName,remoteName);
//        return new ByteArrayInputStream(buffer);
//    }
//
//    /**
//     * 文件删除
//     * @param groupName
//     * @param remoteName
//     * @return
//     * @throws IOException
//     * @throws MyException
//     */
//    public static int deleteFile(String groupName, String remoteName) throws IOException, MyException {
//        TrackerServer trackerServer = getTrackerServer();
//        StorageClient storageClient = getStorageClient(trackerServer);
//        int i = storageClient.delete_file(groupName, remoteName);
//        return i;
//    }
//
//    /**
//     * 获取Storage信息
//     * @return
//     * @throws IOException
//     */
//    public static StorageServer getStorages() throws IOException {
//        TrackerClient trackerClient = new TrackerClient();
//        TrackerServer trackerServer = trackerClient.getConnection();
//        return trackerClient.getStoreStorage(trackerServer);
//    }
//
//    /**
//     * 获取StorageServer信息
//     * @param groupName
//     * @param remoteName
//     * @return
//     * @throws IOException
//     */
//    public static StorageServer getServerInfo(String groupName, String remoteName) throws IOException {
//        TrackerClient trackerClient = new TrackerClient();
//        TrackerServer trackerServer = trackerClient.getConnection();
//        return trackerClient.getFetchStorage(trackerServer,groupName,remoteName);
//    }
//
//
//    /**
//     * 获取Tracker信息
//     * @return
//     * @throws IOException
//     */
//    public static String getTrackerInfo() throws IOException {
//        TrackerServer trackerServer = getTrackerServer();
//        String ip = trackerServer.getInetSocketAddress().getHostString();
//        int trackerHttpPort = ClientGlobal.getG_tracker_http_port();
//        String url = "http://"+ip+":"+trackerHttpPort;
//        return url;
//    }
//
//    /**
//     * 获取Tracker
//     * @return
//     * @throws IOException
//     */
//    public static TrackerServer getTrackerServer() throws IOException {
//        TrackerClient trackerClient = new TrackerClient();
//        TrackerServer trackerServer = trackerClient.getConnection();
//        return trackerServer;
//    }
//
//    /**
//     * 获取StorageClient
//     * @param trackerServer
//     * @return
//     */
//    public static StorageClient getStorageClient(TrackerServer trackerServer){
//        StorageClient storageClient = new StorageClient(trackerServer,null);
//        return storageClient;
//    }
}

